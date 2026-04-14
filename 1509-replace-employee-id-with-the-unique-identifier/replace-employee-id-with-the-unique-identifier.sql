SELECT emp.unique_id, e.name
FROM Employees AS e
left JOIN EmployeeUNI AS emp
ON e.id = emp.id;