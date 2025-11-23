-- Migrations para criar a coluna de RANK na tabela de ninjas

ALTER TABLE TB_NINJAS
ADD COLUMN RANK VARCHAR(255);