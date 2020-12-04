USE [gandre03]
GO

/****** Object:  Table [dbo].[LOGIN]    Script Date: 04-Dec-20 7:22:30 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[LOGIN]') AND type in (N'U'))
DROP TABLE [dbo].[LOGIN]
GO

/****** Object:  Table [dbo].[LOGIN]    Script Date: 04-Dec-20 7:22:30 PM ******/
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


