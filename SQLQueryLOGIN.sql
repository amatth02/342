USE [mdiola01]
GO

ALTER TABLE [dbo].[LOGIN] DROP CONSTRAINT [FK_LOGIN_USER]
GO

/****** Object:  Table [dbo].[LOGIN]    Script Date: 04/12/2020 11:19:20 pm ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[LOGIN]') AND type in (N'U'))
DROP TABLE [dbo].[LOGIN]
GO

/****** Object:  Table [dbo].[LOGIN]    Script Date: 04/12/2020 11:19:20 pm ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[LOGIN](
	[userID] [int] NOT NULL,
	[password] [nvarchar](50) NOT NULL
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[LOGIN]  WITH CHECK ADD  CONSTRAINT [FK_LOGIN_USER] FOREIGN KEY([userID])
REFERENCES [dbo].[USER] ([userID])
GO

ALTER TABLE [dbo].[LOGIN] CHECK CONSTRAINT [FK_LOGIN_USER]
GO


