using System.Net.Http.Headers;

namespace program;
public class BTree<T>
{
	public T? node;
	public BTree<T>? left;
	public BTree<T>? right;

	public BTree(T? node, BTree<T>? left, BTree<T>? right)
	{
		this.node = node;
		this.left = left;
		this.right = right;
	}

	public bool IsEmpty()
	{
		bool empty = node == null;
		if (left != null) {
			empty &= left.IsEmpty();
		}
		if (right != null) {
			empty &= right.IsEmpty();
		}
		return empty;
	}

	public bool IsLeaf()
	{
		return left == null && right == null;
	}

	public BTree<T>? GetSag()
	{
		return left;
	}

	public BTree<T>? GetSad()
	{
		return right;
	}

	public T? GetValue()
	{
		return node;
	}

	public bool Contains(T? compared){
		
		return node != null ? node.Equals(compared) : compared == null;
	}

	public uint GetHeight()
	{
		return uint.Max(left != null ?left.GetHeight() : 0,right != null ? right.GetHeight() : 0);
	}
}


public class Exo1
{
	public static void Test()
	{
		Console.WriteLine("Hello World!");
	}
}
