public void calculateTotalWage()
    {
        for (CompanyEmpWage company : companies)
        {
            int totalWage = calculateTotalWage(company);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company);
        }
    }

    int calculateTotalWage(CompanyEmpWage companyEmpWage)
    {
        System.out.println("Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%4s\t%4s\t%2s\t%4s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_WORKING_DAYS
                && totalWorkingHrs <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int empType = generateEmployeeType();
            workingHrs = getWorkingHrs(empType);
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%4d\t%5d\t%10d\t%10d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        totalEmpWages.put(companyEmpWage.COMPANY_NAME, totalWage);
        return totalWage;
    }

    public int getTotalEmpWage(String companyName)
    {
        return totalEmpWages.get(companyName);
    }

    public static void main(String args[])
    {
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
        employeeWageComputation.addCompany("Microsoft", 4, 30, 100);
        employeeWageComputation.addCompany("Google", 5, 40, 170);
        employeeWageComputation.addCompany("Amazon", 19, 10, 150);
        employeeWageComputation.calculateTotalWage();
        String query = "Google";
        int totalWage = employeeWageComputation.getTotalEmpWage(query);
        System.out.println("Total Employee Wage for " + query + " company is " + totalWage);
    }
}