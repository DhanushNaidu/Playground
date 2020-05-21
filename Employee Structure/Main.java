#include <stdio.h>
struct employee{
    char name[30];
  	char deg[30];
    int id, age;
    int salary;
};
 
int main()
{
    struct employee emp;
    printf("Enter name:\n");          scanf("%s",emp.name);
    printf("Enter ID:\n");            scanf("%d",&emp.id);
  	printf("Enter age:\n");            scanf("%d",&emp.age);
 	printf("Enter designation:\n");      scanf("%s", emp.deg);
    printf("Enter Salary:\n");        scanf("%d",&emp.salary);
	printf("Employee Details\n");
    printf("Name of the Employee:%s\n",emp.name);
    printf("ID of the Employee:%d\n",emp.id);
  	printf("Age of the Employee:%d\n",emp.age);
	printf("Designation of the employee:%s\n",emp.deg);
    printf("Salary of the Employee:%d\n",emp.salary);
    return 0;
}