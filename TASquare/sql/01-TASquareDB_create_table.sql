begin;

CREATE TABLE tracker (
    tracker_id      serial,                 -- トラッカーID
    tracker_name    varchar(20) NOT NULL,   -- トラッカー名（バグ、作業、サポートなど）
    PRIMARY KEY(tracker_id)
);

CREATE TABLE project (
    project_id      serial,                 -- プロジェクトID
    project_name    varchar(100) NOT NULL,  -- プロジェクト名
    description     varchar(1000),          -- プロジェクト説明
    PRIMARY KEY(project_id)
);

CREATE TABLE status (
    status_id       serial,                 -- ステータスID
    status_name     varchar(20) NOT NULL,   -- 状態名（新規、進行中、終了など）
    progress_rate   smallint    NOT NULL,   -- 進捗率
    closed_flag        boolean     NOT NULL,   -- 終了フラグ
    PRIMARY KEY(status_id)
);


CREATE TABLE user_info (
    user_id         varchar(40),            -- ユーザID
    password        varchar(40) NOT NULL,   -- パスワード
    user_name       varchar(40) NOT NULL,   -- ユーザ名
    mail_address    varchar(100),           -- メールアドレス
    regist_date     TIMESTAMP   NOT NULL    DEFAULT CURRENT_TIMESTAMP,  -- 登録日時
    update_date     TIMESTAMP   NOT NULL    DEFAULT CURRENT_TIMESTAMP,  -- 更新日時
    PRIMARY KEY(user_id)
);

CREATE TABLE priority (
    priority_id     serial,                 -- 優先度ID
    priority_type   varchar(20) NOT NULL,   -- 優先度種別（低め、通常、高めなど）
    PRIMARY KEY(priority_id)
);

CREATE TABLE version (
    version_id      serial,                 -- 対象バージョンID
    project_id      integer     NOT NULL    references project(project_id),   -- プロジェクト（外部キー[project:project_id]）
    version_name    varchar(100) NOT NULL,  -- 対象バージョン名
    PRIMARY KEY(version_id)
);

CREATE TABLE member (
    member_id       serial,                 -- メンバーID
    user_id         varchar(40) NOT NULL    references user_info(user_id),    -- ユーザ（外部キー[user_info:user_id]）
    project_id      integer     NOT NULL    references project(project_id),   -- プロジェクト（外部キー[project:project_id]）
    PRIMARY KEY(member_id)
);

CREATE TABLE ticket (
    ticket_id       serial,                 -- チケットID
    tracker_id      integer     NOT NULL    references tracker(tracker_id),   -- トラッカー（外部キー[tracker:tracker_id]）
    project_id      integer     NOT NULL    references project(project_id),   -- プロジェクト（外部キー[project:project_id]）
    description     varchar(1000),          -- チケット説明
    status_id       integer     NOT NULL    references status(status_id),     -- ステータス（外部キー[status:status_id]）
    assigned_to_id  varchar(40)             references user_info(user_id),    -- 担当者（外部キー[user_info:user_id]）
    priority_id     integer     NOT NULL    references priority(priority_id), -- 優先度（外部キー[priority:priority_id]）
    version_id      integer     NOT NULL    references version(version_id),   -- 対象バージョン（外部キー[version:version_id]）
    author_id       varchar(40) NOT NULL    references user_info(user_id),    -- チケット作成者（外部キー[user_info:user_id]）
    regist_date     TIMESTAMP   NOT NULL    DEFAULT CURRENT_TIMESTAMP,        -- 登録日時
    update_date     TIMESTAMP   NOT NULL    DEFAULT CURRENT_TIMESTAMP,        -- 更新日時
    start_date      date,                   -- 開始日
    estimated_hours integer,                -- 予定工数
    PRIMARY KEY(ticket_id)
);

commit;
