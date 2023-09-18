
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