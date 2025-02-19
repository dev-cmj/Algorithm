-- 코드를 입력하세요
SELECT 
    YEAR(O.SALES_DATE) AS YEAR, 
    MONTH(O.SALES_DATE) AS MONTH, 
    U.GENDER, 
    COUNT(DISTINCT O.USER_ID) AS USERS
FROM ONLINE_SALE O
JOIN USER_INFO U ON O.USER_ID = U.USER_ID
WHERE U.GENDER IS NOT NULL
GROUP BY YEAR, MONTH, U.GENDER
ORDER BY YEAR, MONTH, U.GENDER;