public class StringBufferDemo {
    public void main(String[] args){
        StringBuffer sb=new StringBuffer("java");
        System.out.print("Original:"+sb);
        sb.append("programming");
        System.out.println("After append:"+sb);
        sb.insert(5,"is");
        System.out.println("After insert:"+sb);
        sb.replace(0,4,"python");
}                          
}
