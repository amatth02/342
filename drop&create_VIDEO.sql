USE [gandre03]
GO

/****** Object:  Table [dbo].[VIDEO]    Script Date: 04-Dec-20 7:16:07 PM ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[VIDEO]') AND type in (N'U'))
DROP TABLE [dbo].[VIDEO]
GO

/****** Object:  Table [dbo].[VIDEO]    Script Date: 04-Dec-20 7:16:07 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[VIDEO](
	[videoID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[message] [nvarchar](50) NOT NULL,
	[description] [nvarchar](50) NOT NULL,
	[length] [int] NOT NULL,
	[comments] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_VIDEO] PRIMARY KEY CLUSTERED 
(
	[videoID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


ALTER TABLE [dbo].[VIDEO]  WITH CHECK ADD  CONSTRAINT [FK_VIDEO_USER] FOREIGN KEY([userID])
REFERENCES [dbo].[USER] ([userID])
GO

ALTER TABLE [dbo].[VIDEO] CHECK CONSTRAINT [FK_VIDEO_USER]
GO



