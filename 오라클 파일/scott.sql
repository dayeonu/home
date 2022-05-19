select first_name, salary,
    rank() over(order by salary desc) as rank, -- 랭크 오름차순
    dense_rank() over(order by salary desc) as dense_rank, -- 동일 순위 일 경우 
    row_number() over(order by salary desc) as row_rank
from employees;