public class TrappedRainWatter {
    public static int TrappedRainWatter(int[] height) {
        // calculate left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }
        // calculate right max boundary - array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Loop through the height array
        for (int i = 0; i < height.length; i++) {
            // water level = min(left max boundary, right max boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = water level - height[i]
            int trappedWater = waterLevel - height[i];
            System.out.print(trappedWater + " ");
        }

        System.out.println();
        // calculate total trapped water
        int totalTrappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            int trappedWater = waterLevel - height[i];
            totalTrappedWater += trappedWater;
        }
        return totalTrappedWater;
    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        int result = TrappedRainWatter(height);
        System.out.println("Trapped rainwater: " + result);
    }
}
