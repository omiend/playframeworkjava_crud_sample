# --- Created by Ebean DDL

# --- !Ups

create table child (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  child                     bigint,
  create_date               datetime not null,
  update_date               datetime not null,
  constraint pk_child primary key (id))
;

create table parent (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  create_date               datetime not null,
  update_date               datetime not null,
  constraint pk_parent primary key (id))
;

alter table child add constraint fk_child_parent_1 foreign key (child) references parent (id) on delete restrict on update restrict;
create index ix_child_parent_1 on child (child);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table child;

drop table parent;

SET FOREIGN_KEY_CHECKS=1;

