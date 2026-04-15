CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
declare M int;
set m = N-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary
      from employee
      order by salary desc
      LIMIT 1 OFFSET m
      
  );
END