import java.util.HashMap;

/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    HashMap<String, String> agenda;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();
    }
    
    /**
     * Introduce los nombres y el numero asociado a la persona
     */
    public void enterNumber(String name, String number)
    {
        agenda.put(name, number);
    }

    /**
     * Consigue el numero de la persona
     */
    public void lookupNumber(String name)
    {
        System.out.println(agenda.get(name));
    }
}
