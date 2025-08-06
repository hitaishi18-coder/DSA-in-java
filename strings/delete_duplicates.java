public class delete_duplicates 
{
    public static void main(String[] args) 
    {
        String s = "SSHHHEE WWAAASS GOOIINNG TOOO MAAARKKET 2222 ";
        System.out.println(deleteDuplicates(s));
    }
    static String deleteDuplicates(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        for(int i=0;i<=sb.length()-2;i++)
        {
            if(sb.charAt(i)==(sb.charAt(i+1)))
            {
                sb.delete(i,i+1);
                i--;
            }
        }
        return sb.toString();
    }
}
