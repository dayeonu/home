select first_name, salary,
    rank() over(order by salary desc) as rank, -- ��ũ ��������
    dense_rank() over(order by salary desc) as dense_rank, -- ���� ���� �� ��� 
    row_number() over(order by salary desc) as row_rank
from employees;