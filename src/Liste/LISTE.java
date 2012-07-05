
public class LISTE
{
    private ZAHL erster;

    public LISTE()
    {erster=null;}

    public void hinzufuegenAnfang(ZAHL z)
    {if(erster==null)
        {erster = z;
        }
        else
        {z.setNachfolger(erster);
            erster = z;
        }

    }
    
    public void hinzufuegenEnde(ZAHL z)
    {if (erster == null)
        {erster = z;
        }
        else
        {
           erster.hinzufuegenEnde(z);
        }
    }
    
    public void entferneAnfang()
    {
        erster = erster.getNachfolger();
    }
    
    public void entferneEnde()
    {
    
    }
    
            
}