begin;

DELETE FROM priority where priority_type = '低め';

DELETE FROM priority where priority_type = '通常';

DELETE FROM priority where priority_type = '高め';

DELETE FROM priority where priority_type = '急いで';

DELETE FROM priority where priority_type = '今すぐ';

commit;
