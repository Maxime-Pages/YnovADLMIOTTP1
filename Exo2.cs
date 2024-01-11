//Ligne 5 -> this.contenu = x
//Ligne 6 -> this.suivant = a

public class CList<T> {
    public T? node;
    public CList<T>? next;
    public CList(T? node, CList<T>? next)
    {
        this.node = node;
        this.next = next;
    }

    public void Add(T? next){
        CList<T>? temp = this;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new CList<T>(next,null);
    }

    public bool Contains(T? searched){
        if (node == null) return searched == null ? true : (next == null ? false : next.Contains(searched));
        return node.Equals(searched) ? true : (next == null ? false : next.Contains(searched));
    }

    public void Delete(T element)
    {
        if (node != null && node.Equals(element))
        {
            if (next != null)
            {
                next = next.next;
            }
            else
            {
                next = null;
            }
            return;
        }
            
        if (next == null)
            return;

        next.Delete(element);
    }

    public void Concat(CList<T> other)
    {
        CList<T>? temp = this;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = other;
    }

    public void Print() {
        Console.Write("[");
        Console.Write(node == null ? ";": node.ToString());
        CList<T>? temp = this;
        while (temp.next != null)
        {
            temp = temp.next;
            Console.Write("; " + (temp.node == null ? ";": temp.node.ToString()));
        }
        Console.WriteLine("]");
    }


    public static CList<T> Anonyme(CList<T> a)
    {
        CList<T> b = null;
        while (a != null) {
            CList<T> c = a.next;
            a.next = b;
            b = a;
            a = c;
        }
        return b;
    }
}

public class Exo2
{
	public static void Test()
	{
		CList<int> l1 = new CList<int>(5, new CList<int>(6, null));
        l1.Add(18);
        l1.Add(25);
        l1.node = 31;
        CList<int> l2 = CList<int>.Anonyme(l1);
        l1.Print();
	}

    //Q1: Ce sont toutes deux des attribut d'instances car ils ne sont pas statiques
    //Q3: La Fonction supprime tous les éléments sauf le 1er
}

