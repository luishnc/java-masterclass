package com.luis;

class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        String namesFormated[];

        for (int i= 0, i< names1.length,i++){
            namesFormated. = names1[i];
        }
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }



    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};

        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}