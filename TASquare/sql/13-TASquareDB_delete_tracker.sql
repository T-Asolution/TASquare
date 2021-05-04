begin;

DELETE FROM tracker where tracker_name = 'バグ';

DELETE FROM tracker where tracker_name = '作業';

DELETE FROM tracker where tracker_name = 'サポート';

commit;
