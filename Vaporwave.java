// ni kentod!!
import java.lang.*;

public class Vaporwave
{
  private String m_vaporStr;
  private int m_vaporStrLen;
  
  public Vaporwave()
  {
    this.m_vaporStr = new String();
    this.m_vaporStrLen = m_vaporStr.length();
    this.convertToVaporwave();
  }
  
  public Vaporwave(String vaporStr)
  {
    this.m_vaporStr = vaporStr;
    this.m_vaporStrLen = m_vaporStr.length();
    this.convertToVaporwave();
  }
  
  public Vaporwave(Vaporwave vaporStr)
  {
    this.m_vaporStr = vaporStr.getString();
    this.m_vaporStrLen = vaporStr.getLength();
    this.convertToVaporwave();
  }
  
  public String getString()
  {
    return m_vaporStr;
  }
  
  public int getLength()
  {
    return m_vaporStrLen;
  }
  
  public void convertToVaporwave()
  {
    char[] str = m_vaporStr.toCharArray(); // for fucking java that can't use string indexing with java.lang.String lol
    
    for(int i = 0; i < m_vaporStrLen; i++)
    {
      switch(str[i])
      {
      case ' ':
      case '\r':
      case '\n':
      	str[i] = str[i];
        break;
      default:
        if(str[i] >= 0x0020 && str[i] <= 0xC0)
      	{
        	str[i] = (char)(0xFF00 | str[i] - 0x0020);
        }        
        else
          str[i] = str[i];
        break;
      }
    }
    
    m_vaporStr = new String(str);
  }
}
