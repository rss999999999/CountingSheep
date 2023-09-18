/*

Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

        For example,

        [true,  true,  true,  false,
        true,  true,  true,  true ,
        true,  false, true,  false,
        true,  false, false, true ,
        true,  true,  true,  true ,
        false, false, true,  true]
        The correct answer would be 17.

        Hint: Don't forget to check for bad values like null/undefined

*/

class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;

        //This line iterates through the arrayOfSheeps array and assigns the current element to the sheep variable, that can be true or false.
        for (Boolean sheep : arrayOfSheeps) {
            //This line checks if the current element sheep is not null and is true. If both conditions are true, the code inside the if statement will be executed.
            if (sheep != null && sheep) {
                count++;
            }
        }
        return count;
    }
}