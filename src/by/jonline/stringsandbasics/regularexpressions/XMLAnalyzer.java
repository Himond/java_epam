package by.jonline.stringsandbasics.regularexpressions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class XMLAnalyzer{
    private String text = "";
    private final String ROOT_NODE = "<(\\w+)>\\s";
    private final String CHILD_NODE_WITH_ATRIBUTE = "<(\\w+\\s\\w*.*\\d+.+)>\\s";
    private final String CHILD_NODE = "<(\\w+\\s\\w+\\ .\\s\\\"\\d+\\\"|\\w+)>\\b";

    public XMLAnalyzer(String fileName) throws IOException {
        int ch;
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((ch = br.read()) != -1){
                text += (char) ch;
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public String[] getParentNode() throws IOException {
        StringBuilder rootElems = new StringBuilder();
        String root;
        Pattern pattern = Pattern.compile(ROOT_NODE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            root = matcher.group(1);
            if(!rootElems.toString().contains(root)){
                rootElems.append(root).append("_");
            }
        }
        return rootElems.toString().trim().split("_");
    }

    public String[] getChildNodeWithAtribute() throws IOException {
        StringBuilder childElems = new StringBuilder();
        String child;
        Pattern pattern = Pattern.compile(CHILD_NODE_WITH_ATRIBUTE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            child = matcher.group(1);
            if(!childElems.toString().contains(child)){
                childElems.append(child).append("_");
            }
        }
        return childElems.toString().trim().split("_");
    }

    public String[] getChildNode() throws IOException {
        StringBuilder childElems = new StringBuilder();
        String child;
        Pattern pattern = Pattern.compile(CHILD_NODE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            child = matcher.group(1);
            if(!childElems.toString().contains(child)){
                childElems.append(child).append("_");
            }
        }
        return childElems.toString().trim().split("_");
    }


    public String getElementsByTagName(String parentTeg, String childTeg){
        String parentPat = String.format("<%s>([\\S\\s]*?)</%s>", parentTeg, parentTeg);
        String childPat = String.format("<%s>([\\S\\s]*?)</%s>", childTeg, childTeg);
        if(parentTeg.contains("id")){
            Pattern pattern = Pattern.compile("(\\w*).id.*?(\\d+)");
            Matcher matcher = pattern.matcher(parentTeg);
            while (matcher.find()){
                String name = matcher.group(1);

                int id = Integer.parseInt(matcher.group(2));
                parentPat = String.format("<%s(?=\\s)[^>]*?\\sid\\s?=\\s?\\\"%d\\\"[^>]*?>([\\S\\s]*?)</%s>", name, id, name);
            }
        }else if(childTeg.contains("id")){
            Pattern pattern = Pattern.compile("(\\w*).id.*(\\d+)");
            Matcher matcher = pattern.matcher(childTeg);
            while (matcher.find()){
                String name = matcher.group(1);
                int id = Integer.parseInt(matcher.group(2));
                childPat = String.format("<%s(?=\\s)[^>]*?\\sid\\s?=\\s?\\\"%d\\\"[^>]*?>([\\S\\s]*?)</%s>", name, id, name);
            }
        }

        String parentElem = null;
        String childElem = null;
        Pattern patternParent = Pattern.compile(parentPat);
        Matcher matcherParent = patternParent.matcher(text);

        while (matcherParent.find()){
            parentElem = matcherParent.group(1);
        }
        if (parentElem != null){
            Pattern patternChild = Pattern.compile(childPat);
            Matcher matcherChilde = patternChild.matcher(parentElem);

            while (matcherChilde.find()){
                childElem = matcherChilde.group(1);
            }
            return childElem;
        }
        return null;
    }


}