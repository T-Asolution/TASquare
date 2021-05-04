begin;

INSERT INTO status (status_name, progress_rate, closed_flag) VALUES ('新規', 0, false);

INSERT INTO status (status_name, progress_rate, closed_flag) VALUES ('進行中（20%）', 20, false);

INSERT INTO status (status_name, progress_rate, closed_flag) VALUES ('進行中（50%）', 50, false);

INSERT INTO status (status_name, progress_rate, closed_flag) VALUES ('進行中（80%）', 80, false);

INSERT INTO status (status_name, progress_rate, closed_flag) VALUES ('終了', 100, true);

INSERT INTO status (status_name, progress_rate, closed_flag) VALUES ('却下', 0, true);

commit;
