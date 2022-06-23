class pattern1
{
public static void main(String args[])
{
int i,j,k,row=5,col=10,num;
for(i=1;i<=row;i++)
{
	k=1;
	for(j=1;j<=col;j++)
	{
		if((j>=6-i) && (j<=4+i) && (k==1))
		{
		System.out.print("*");
		k=0;
		}
		else
		{
		System.out.print(" ");
		k=1;
		}

	}
   System.out.println("");
}


}


}

