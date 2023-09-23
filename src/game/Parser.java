/*
 * Sample Java file by Huw Collingbourne
 *
 * This code (and other sample code) accompanies the book
 *    "The Little Book of Adventure Game Programming In Java"
 * Source code can be downloaded from:
 *     http://www.bitwisebooks.com
 */
package game;

import globals.WT;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Parser {

    static HashMap<String, WT> vocab = new HashMap<>();

    static void initVocab() {

        //NOUNS
        vocab.put("acorn", WT.NOUN);
        vocab.put("amulet", WT.NOUN);
        vocab.put("bed", WT.NOUN);
        vocab.put("bird stone", WT.NOUN);
        vocab.put("bone", WT.NOUN);
        vocab.put("bowl", WT.NOUN);
        vocab.put("box", WT.NOUN);
        vocab.put("button", WT.NOUN);
        vocab.put("carrot", WT.NOUN);
        vocab.put("cat stone", WT.NOUN);
        vocab.put("chest", WT.NOUN);
        vocab.put("coconut", WT.NOUN);
        vocab.put("coin", WT.NOUN);
        vocab.put("door", WT.NOUN);
        vocab.put("dust", WT.NOUN);
        vocab.put("fresh water", WT.NOUN);
        vocab.put("gardenia", WT.NOUN);
        vocab.put("key", WT.NOUN);
        vocab.put("knife", WT.NOUN);
        vocab.put("lamp", WT.NOUN);
        vocab.put("leaflet", WT.NOUN);
        vocab.put("lever", WT.NOUN);
        vocab.put("lizard stone", WT.NOUN);
        vocab.put("moss", WT.NOUN);
        vocab.put("orange", WT.NOUN);
        vocab.put("palm-leaves", WT.NOUN);
        vocab.put("paper", WT.NOUN);
        vocab.put("pencil", WT.NOUN);
        vocab.put("sack", WT.NOUN);
        vocab.put("salt water", WT.NOUN);
        vocab.put("sand", WT.NOUN);
        vocab.put("sausage", WT.NOUN);
        vocab.put("sea shell", WT.NOUN);
        vocab.put("sign", WT.NOUN);
        vocab.put("slot", WT.NOUN);
        vocab.put("squirrel", WT.NOUN);
        vocab.put("sword", WT.NOUN);
        vocab.put("tree", WT.NOUN);
        vocab.put("vines", WT.NOUN);
        vocab.put("wombat", WT.NOUN);
        vocab.put("wood", WT.NOUN);

        //VERBS
        vocab.put("test", WT.VERB);
        vocab.put("get", WT.VERB);
        vocab.put("i", WT.VERB);
        vocab.put("inventory", WT.VERB);
        vocab.put("take", WT.VERB);
        vocab.put("drop", WT.VERB);
        vocab.put("put", WT.VERB);
        vocab.put("l", WT.VERB);
        vocab.put("look", WT.VERB);
        vocab.put("open", WT.VERB);
        vocab.put("close", WT.VERB);
        vocab.put("pull", WT.VERB);
        vocab.put("push", WT.VERB);
        vocab.put("help", WT.VERB);
        vocab.put("n", WT.VERB);
        vocab.put("s", WT.VERB);
        vocab.put("w", WT.VERB);
        vocab.put("e", WT.VERB);
        vocab.put("up", WT.VERB);
        vocab.put("down", WT.VERB);
        vocab.put("q", WT.VERB);
        vocab.put("quit", WT.VERB);
        vocab.put("map", WT.VERB);

        //ARTICLES
        vocab.put("a", WT.ARTICLE);
        vocab.put("an", WT.ARTICLE);
        vocab.put("the", WT.ARTICLE);

        //PREPOSITIONS
        vocab.put("in", WT.PREPOSITION);
        vocab.put("into", WT.PREPOSITION);
        vocab.put("at", WT.PREPOSITION);
    }

    static String processVerbNounPrepositionNoun(List<WordAndType> command) {
        WordAndType wt = command.get(0);
        WordAndType wt2 = command.get(1);
        WordAndType wt3 = command.get(2);
        WordAndType wt4 = command.get(3);
        String msg = "";
        
        if ((wt.getWordtype() != WT.VERB) || (wt3.getWordtype() != WT.PREPOSITION)) {
            msg = "Can't do this because I don't understand ho to '" + wt.getWord() + " something " + wt3.getWord() + "' something!";
        } else if (wt2.getWordtype() != WT.NOUN) {
            msg = "Can't do this because '" + wt2.getWord() + "' is not an object!\r\n";
        } else if (wt4.getWordtype() != WT.NOUN) {
            msg = "Can't do this because '" + wt4.getWord() + "' is not an object!\r\n";
        } else {
            switch (wt.getWord() + wt3.getWord()) {
                case "putin":
                case "putinto":
                    msg = ForgottenConquest.game.putObInContainer(wt2.getWord(), wt4.getWord());
                    break;
                default:
                    msg = "I don't know how to " + wt.getWord() + " " + wt2.getWord() + " " + wt3.getWord() + " " + wt4.getWord() + "!";
                    break;
            }
        }
        return msg;
    }

    static String processVerbPrepositionNoun(List<WordAndType> command) {
        // "look at" is the only implemented command of this type
        WordAndType wt = command.get(0);
        WordAndType wt2 = command.get(1);
        WordAndType wt3 = command.get(2);
        String msg = "";
        
        if ((wt.getWordtype() != WT.VERB) || (wt2.getWordtype() != WT.PREPOSITION)) {
            msg = "Can't do this because I don't understand '" + wt.getWord() + " " + wt2.getWord() + "' !";
        } else if (wt3.getWordtype() != WT.NOUN) {
            msg = "Can't do this because '" + wt3.getWord() + "' is not an object!\r\n";
        } else {
            switch (wt.getWord() + wt2.getWord()) {
                case "lookat":
                    msg = ForgottenConquest.game.lookAtOb(wt3.getWord());
                    break;
                case "lookin":
                    msg = ForgottenConquest.game.lookInOb(wt3.getWord());
                    break;
                default:
                    msg = "I don't know how to " + wt.getWord() + " " + wt2.getWord() + " " + wt3.getWord() + "!";
                    break;
            }
        }
        return msg;
    }

    static String processVerbNoun(List<WordAndType> command) {
        WordAndType wt = command.get(0);
        WordAndType wt2 = command.get(1);
        String msg = "";

        if (wt.getWordtype() != WT.VERB) {
            msg = "Can't do this because '" + wt.getWord() + "' is not a command!";
        } else if (wt2.getWordtype() != WT.NOUN) {
            msg = "Can't do this because '" + wt2.getWord() + "' is not an object!";
        } else {
            switch (wt.getWord()) {
                case "take":
                case "get":
                    msg = ForgottenConquest.game.takeOb(wt2.getWord());
                    break;
                case "drop":
                    msg = ForgottenConquest.game.dropOb(wt2.getWord());
                    break;
                case "open":
                    msg = ForgottenConquest.game.openOb(wt2.getWord());
                    break;
                case "close":
                    msg = ForgottenConquest.game.closeOb(wt2.getWord());
                    break;
                default:
                    msg += " (not yet implemented)";
                    break;
            }
        }
        return msg;
    }

    static String processVerb(List<WordAndType> command) {
        WordAndType wt = command.get(0);
        String msg = "";

        if (wt.getWordtype() != WT.VERB) {
            msg = "Can't do this because '" + wt.getWord() + "' is not a command!";
        } else {
            switch (wt.getWord()) {
                case "n":
                    ForgottenConquest.game.goN();
                    break;
                case "s":
                    ForgottenConquest.game.goS();
                    break;
                case "w":
                    ForgottenConquest.game.goW();
                    break;
                case "e":
                    ForgottenConquest.game.goE();
                    break;
                case "up":
                    ForgottenConquest.game.goUp();
                    break;
                case "down":
                    ForgottenConquest.game.goDown();
                    break;
                case "l":
                case "look":
                    ForgottenConquest.game.look();
                    break;
                case "inventory":
                case "i":
                    ForgottenConquest.game.showInventory();
                    break;
                case "map":
                case "m":
                    ForgottenConquest.game.showMap();
                    break;
                case "test":
                    System.out.println("No tests have been created (9/23/23)");
                    break;
                default:
                    msg = wt.getWord() + " (not yet implemented)";
                    break;
            }
        }
        return msg;
    }

    static String processCommand(List<WordAndType> command) {
        String s = "";
        
        if (command.size() == 0) {
            s = "Say something, Spaniard!";
        } else if (command.size() > 4) {
            s = "What are you trying to say, Spaniard? Your command is too long!";
        } else {           
            switch (command.size()) {
                case 1:
                    s = processVerb(command);
                    break;
                case 2:
                    s = processVerbNoun(command);
                    break;
                case 3:
                    s = processVerbPrepositionNoun(command);
                    break;
                case 4:
                    s = processVerbNounPrepositionNoun(command);
                    break;
                default:
                    s = "Unable to process command";
                    break;
            }
        }
        return s;
    }

    static String parseCommand(List<String> wordlist) {
        List<WordAndType> command = new ArrayList<>();
        WT wordtype;
        String errmsg = "";
        String msg;

        for (String k : wordlist) {
            if (vocab.containsKey(k)) {
                wordtype = vocab.get(k);
                if (wordtype == WT.ARTICLE) {       // ignore articles             
                } else {
                    command.add(new WordAndType(k, wordtype));
                }
            } else { // if word not found in vocab
                command.add(new WordAndType(k, WT.ERROR));
                errmsg = "You speak in strange tongues, Spaniard. '" + k + "' isn't something well understood";
            }
        }
        if (!errmsg.isEmpty()) {
            msg = errmsg;
        } else {
            msg = processCommand(command);
        }
        return msg;
    }

    static List<String> wordList(String input) {
        String delims = "[ \t,.:;?!\"']+";
        List<String> strlist = new ArrayList<>();
        String[] words = input.split(delims);

        for (String word : words) {
            strlist.add(word);
        }
        return strlist;
    }
}
