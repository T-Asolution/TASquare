begin;

DELETE FROM status where status_name = '新規';

DELETE FROM status where status_name = '進行中（20%）';

DELETE FROM status where status_name = '進行中（50%）';

DELETE FROM status where status_name = '進行中（80%）';

DELETE FROM status where status_name = '終了';

DELETE FROM status where status_name = '却下';

commit;
