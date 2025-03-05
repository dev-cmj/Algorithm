-- 코드를 작성해주세요
SELECT 
   FI.ID,
   FNI.FISH_NAME,
   FI.LENGTH
FROM 
   FISH_INFO FI
JOIN 
   FISH_NAME_INFO FNI ON FI.FISH_TYPE = FNI.FISH_TYPE
WHERE 
   (FI.FISH_TYPE, FI.LENGTH) IN (
       SELECT 
           FISH_TYPE, 
           MAX(LENGTH) 
       FROM 
           FISH_INFO 
       WHERE 
           LENGTH IS NOT NULL
       GROUP BY 
           FISH_TYPE
   )
ORDER BY 
   FI.ID ASC;