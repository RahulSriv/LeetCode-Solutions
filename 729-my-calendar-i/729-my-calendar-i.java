class MyCalendar {
    List<int[]> al;
    public MyCalendar() {
        al=new ArrayList<>();   
    }
    public boolean book(int start, int end) {
        for(int[] arr:al){
            if(end>arr[0] && start<arr[1])
                return false;
        }
        al.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */