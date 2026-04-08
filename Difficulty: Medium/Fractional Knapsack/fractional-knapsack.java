class Solution {
    
    class Item {
        int value, weight;
        
        Item(int v, int w) {
            value = v;
            weight = w;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        Item[] items = new Item[n];
        for(int i = 0; i<n; i++){
            items[i] = new Item(val[i], wt[i]);
        }
        Arrays.sort(items, (a, b) -> 
            Double.compare((double)b.value / b.weight, (double)a.value / a.weight)
        );
        
        double totalValue = 0.0;

        
        for(int i = 0; i < n; i++) {
            if(capacity >= items[i].weight) {
                totalValue += items[i].value;
                capacity -= items[i].weight;
            } else {
                totalValue += ((double)items[i].value / items[i].weight) * capacity;
                break;
            }
        }

        return totalValue;
    }
    
}