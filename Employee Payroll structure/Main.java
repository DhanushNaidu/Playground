#include<stdio.h>
struct payroll
{
    int id,bs, hra, da, ma, pf, ins;
	char name[20];
	float gross, net;
};

int main()
{
  int j,i,eid;
  printf("Enter the number of employees: ");
  int n;
  scanf("%d",&n);
  printf("\nEnter your input for every employee:\n");
  struct payroll emp[n];
  for(i=0;i<n;i++)
  {
    printf("Employee ID: ");
    scanf("%d",&emp[i].id);
    printf("\nEmployee Name: ");
    scanf("%s",emp[i].name);
    printf("\nBasic salary,HRA: ");
    scanf("%d%d",&emp[i].bs,&emp[i].hra);
    printf("\nDA,Medical Allowance: ");
    scanf("%d%d",&emp[i].da,&emp[i].ma);
    printf("\nPF and Insurance:");
    scanf("%d%d",&emp[i].pf,&emp[i].ins);
    emp[i].gross=(emp[i].bs+emp[i].hra+emp[i].ma+emp[i].da)*12;
    emp[i].net=emp[i].gross-(emp[i].pf+emp[i].ins)*12;
  }
  printf("Enter employee ID to get payslip: ");
  scanf("%d",&eid);
  for(i=0;i<n;i++)
  {
   if(eid==emp[i].id)
    {     	
	    printf("\nSalary slip of %s:\n", emp[i].name);
        printf("Employee ID:%d\n", emp[i].id);
        printf("Basic Salary:%d\n", emp[i].bs);
        printf("House Rent Allowance:%d\n", emp[i].hra);
        printf("Dearness Allowance:%d\n", emp[i].da);
        printf("Medical Allowance:%d\n", emp[i].ma);
        printf("Gross Salary:%0.2f Rupees\n",emp[i].gross);
        printf("Deductions:\n");
        printf("Provident fund:%d\n", emp[i].pf);
        printf("Insurance:%d\n", emp[i].ins);
        printf("Net Salary:%0.2f Rupees",emp[i].net);
    }
  }
}