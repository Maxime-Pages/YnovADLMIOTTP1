public class Test { 
    public void main(String[] arg) { 
        List l1 = new List(5, new List(6, null)); 
        l1 = ajouter(18, l1); 
        l1 = ajouter(25, l1); 
        l1.contenu = 31; 
        afficher(l1); 
    } 
}