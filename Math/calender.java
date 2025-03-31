class MyCalendarTwo {
    
    List<int[]> doubleOverlap;
    List<int[]> overallBooking;
    List<int[]> tripleOverlap;

    public MyCalendarTwo() {
        
        doubleOverlap = new ArrayList<>();
        overallBooking = new ArrayList<>();
    }

    public boolean checkOverlap(int start1, int end1, int start2, int end2){
        return Math.max(start1, start2) < Math.min(end1, end2);
    }

    public int[] findOverlappedRedion(int start1, int end1, int start2, int end2){
        return new int[]{Math.max(start1, start2), Math.min(end1, end2)};
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[] region : doubleOverlap){
            if(checkOverlap(region[0], region[1], startTime, endTime)) return false;
        }
        
        for(int[] booking : overallBooking){
            if(checkOverlap(booking[0], booking[1], startTime, endTime)){
                doubleOverlap.add(findOverlappedRedion(booking[0], booking[1], startTime, endTime));
            }
        }
        
        overallBooking.add(new int[]{startTime, endTime});
        return true;
        
    }
}


/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */