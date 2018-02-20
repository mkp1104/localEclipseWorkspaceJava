class E
{
}
class F extends E
{
}
class G extends F
{
}
class H
{
	F test()
	{
	return null;
	}
}
class I extends H
{
	G test()//Co-Variant introduced in JDK 1.5
	{
	return null;
	}
}