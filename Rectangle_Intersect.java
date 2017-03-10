//Check if the rectangles intersect or not
import java.io.*;
import java.lang.*;
class Rectangle_Intersect
{
	public static void main(String args[])throws IOException
	{
		Point l1=new Point(0,0);
		Point r1=new Point(0,0);
		Point l2=new Point(0,0);
		Point r2=new Point(0,0);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<4;i++)
		{
			int x=Integer.parseInt(br.readLine());
			int y=Integer.parseInt(br.readLine());
			if(i==0)
			{
				 l1=new Point(x,y);
			}
			if(i==1)
			{
				 r1=new Point(x,y);
			}
			if(i==2)
			{
				 l2=new Point(x,y);
			}
			if(i==3)
			{
				 r2=new Point(x,y);
			}
			//Point p1=new Point(x,y);
		}
		if(OverlapCheck(l1,r1,l2,r2)==1)
		{
			System.out.println("Overlapping Rectangle");
			System.out.println("Overlapping Area: "+Math.abs((l1.x+r1.x)-(l2.x+r2.x))*Math.abs((l1.y+r1.y)-(l2.y+r2.y)));
		}
		else
			System.out.println("Not Overlapping");
		
	}
	public static int OverlapCheck(Point l1,Point r1,Point l2,Point r2)
	{
		if(l1.x>r2.x||l2.x>r1.x)
			return -1;
		if(l1.y<r2.y||l2.y<r1.y)
			return -1;
		return 1;
	}
}

class Point
{
	int x;
	int y;
	public Point(int x,int y)
	{
		super();
		this.x=x;
		this.y=y;
	}
}