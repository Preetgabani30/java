class pr5_CS
{  
	int data=50;  
	void change(pr5_CS op)
	{  
		op.data=op.data+100;
	}  
	public static void main(String args[])
	{  
		pr5_CS op=new pr5_CS();
		System.out.println("before change "+op.data);  
		op.change(op);  
		System.out.println("after change "+op.data);  
	}  
}  