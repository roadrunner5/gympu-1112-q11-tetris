
public class ZAHL
{
    private int wert;
    private ZAHL nachfolger;

    public ZAHL (int w)
    {
        wert = w;
        nachfolger = null;

    }

    public int getWert()
    {return wert;}

    public ZAHL getNachfolger()
    {return nachfolger;}
    
    public void setNachfolger(ZAHL z)
    {nachfolger = z;}
    
   /* public void entferneEnde()
    {if(nachfolger =  null)
        {
         
        }
       else
       {
        }
    }
    */
    public void hinzufuegenEnde(ZAHL z)
    { if (nachfolger == null)
        {setNachfolger(z);
        }
        else
        {nachfolger.hinzufuegenEnde(z);
        }
        
        
    }
     
}
