-- 코드를 입력하세요 12이하여자/환자이름,환자번호,성별코드,나이,전화번호/ 번호없으면 NONE,나이순 내림, 환자이름 오름
SELECT PT_NAME,PT_NO,GEND_CD,AGE,IFNULL(TLNO,'NONE')
FROM PATIENT
WHERE AGE<=12 AND GEND_CD='W'
ORDER BY AGE DESC,PT_NAME
