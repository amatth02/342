
CREATE TABLE [dbo].[COMMENTS](
    [commentsID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[comments] [nvarchar](200) NOT NULL,
	[albumID] [int] NULL,
	[videoID] [int] NULL
) ON [PRIMARY]
GO

