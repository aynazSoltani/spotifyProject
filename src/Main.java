package spotify;

public class Main {
    public static void main(String[] args) {
        try {
            User barad = new User("barad", "13971402");
            User barsam = new User("barsam", "13981403");

            Music music1 = new Music("gharibe", barad);
            Music music2 = new Music("ashna", barad);
            Music music3 = new Music("divooneh", barsam);

            System.out.println("\nBarad (Regular) trying to create a playlist:");
            try {
                barad.createPlaylist("Barad Playlist", barad);
                System.out.println("Playlist created successfully.");
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("\nBarad (Regular) trying to play music:");
            try {
                barad.playMusic(music1);
                barad.playMusic(music2);
                barad.playMusic(music3);
                barad.playMusic(music1);
                barad.playMusic(music2);
                barad.playMusic(music3);
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("\nBarad (Regular) upgrading to Premium:");
            barad.buyPremium(barad, 3);

            System.out.println("\nBarad (Premium) trying to create a playlist:");
            try {
                barad.createPlaylist("Barad Premium Playlist", barad);
                System.out.println("Playlist created successfully.");
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("\nBarad (Premium) trying to play music:");
            try {
                barad.playMusic(music1);
                barad.playMusic(music2);
                barad.playMusic(music3);
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("\nBarad following Barsam:");
            barad.follow(barsam);
            System.out.println("Barad is now following Barsam.");

            System.out.println("\nSearching for 'gharibe' in Barad's playlist:");
            for (Music music : barad.getPlaylists().get(0).searchInPlaylist("gharibe")) {
                System.out.println("Found: " + music.getTitle());
            }

            System.out.println("\nBarad trying to edit playlist title:");
            try {
                barad.getPlaylists().get(0).editTitle("13971402", "New Playlist Title");
                System.out.println("Playlist title updated successfully.");
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("\nBarad trying to remove 'gharibe' from playlist:");
            try {
                barad.getPlaylists().get(0).removeMusic("13971402", music1);
                System.out.println("gharibe removed successfully.");
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("\npackage spotify;\n" +
                    "\n" +
                    "public class Main {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        try {\n" +
                    "            User barad = new User(\"barad\", \"13971402\");\n" +
                    "            User barsam = new User(\"barsam\", \"13981403\");\n" +
                    "\n" +
                    "            Music music1 = new Music(\"gharibe\", barad);\n" +
                    "            Music music2 = new Music(\"ashna\", barad);\n" +
                    "            Music music3 = new Music(\"divooneh\", barsam);\n" +
                    "\n" +
                    "            System.out.println(\"\\nBarad (Regular) trying to create a playlist:\");\n" +
                    "            try {\n" +
                    "                barad.createPlaylist(\"Barad Playlist\", barad);\n" +
                    "                System.out.println(\"Playlist created successfully.\");\n" +
                    "            } catch (InvalidOperationException e) {\n" +
                    "                System.out.println(e.getMessage());\n" +
                    "            }\n" +
                    "\n" +
                    "            System.out.println(\"\\nBarad (Regular) trying to play music:\");\n" +
                    "            try {\n" +
                    "                barad.playMusic(music1);\n" +
                    "                barad.playMusic(music2);\n" +
                    "                barad.playMusic(music3);\n" +
                    "                barad.playMusic(music1);\n" +
                    "                barad.playMusic(music2);\n" +
                    "                barad.playMusic(music3);\n" +
                    "            } catch (InvalidOperationException e) {\n" +
                    "                System.out.println(e.getMessage());\n" +
                    "            }\n" +
                    "\n" +
                    "            System.out.println(\"\\nBarad (Regular) upgrading to Premium:\");\n" +
                    "            barad.buyPremium(barad, 3);\n" +
                    "\n" +
                    "            System.out.println(\"\\nBarad (Premium) trying to create a playlist:\");\n" +
                    "            try {\n" +
                    "                barad.createPlaylist(\"Barad Premium Playlist\", barad);\n" +
                    "                System.out.println(\"Playlist created successfully.\");\n" +
                    "            } catch (InvalidOperationException e) {\n" +
                    "                System.out.println(e.getMessage());\n" +
                    "            }\n" +
                    "\n" +
                    "            System.out.println(\"\\nBarad (Premium) trying to play music:\");\n" +
                    "            try {\n" +
                    "                barad.playMusic(music1);\n" +
                    "                barad.playMusic(music2);\n" +
                    "                barad.playMusic(music3);\n" +
                    "            } catch (InvalidOperationException e) {\n" +
                    "                System.out.println(e.getMessage());\n" +
                    "            }\n" +
                    "\n" +
                    "            System.out.println(\"\\nBarad following Barsam:\");\n" +
                    "            barad.follow(barsam);\n" +
                    "            System.out.println(\"Barad is now following Barsam.\");\n" +
                    "\n" +
                    "            System.out.println(\"\\nSearching for 'gharibe' in Barad's playlist:\");\n" +
                    "            for (Music music : barad.getPlaylists().get(0).searchInPlaylist(\"gharibe\")) {\n" +
                    "                System.out.println(\"Found: \" + music.getTitle());\n" +
                    "            }\n" +
                    "\n" +
                    "            System.out.println(\"\\nBarad trying to edit playlist title:\");\n" +
                    "            try {\n" +
                    "                barad.getPlaylists().get(0).editTitle(\"13971402\", \"New Playlist Title\");\n" +
                    "                System.out.println(\"Playlist title updated successfully.\");\n" +
                    "            } catch (InvalidOperationException e) {\n" +
                    "                System.out.println(e.getMessage());\n" +
                    "            }\n" +
                    "\n" +
                    "            System.out.println(\"\\nBarad trying to remove 'gharibe' from playlist:\");\n" +
                    "            try {\n" +
                    "                barad.getPlaylists().get(0).removeMusic(\"13971402\", music1);\n" +
                    "                System.out.println(\"gharibe removed successfully.\");\n" +
                    "            } catch (InvalidOperationException e) {\n" +
                    "                System.out.println(e.getMessage());\n" +
                    "            }\n" +
                    "\n" +
                    "            System.out.println(\"\\nBarad shuffling the playlist:\");\n" +
                    "            barad.getPlaylists().get(0).shuffle();\n" +
                    "\n" +
                    "        } catch (InvalidOperationException e) {\n" +
                    "            System.out.println(e.getMessage());\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\nBarad shuffling the playlist:");
            barad.getPlaylists().get(0).shuffle();

        } catch (InvalidOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
