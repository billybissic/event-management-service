INSERT INTO event_types (event_type_name, event_type_description, primary_color, secondary_color) VALUES ('Party', 'Public party, open invitation to the public.', '#00F3FF', '#17263B');
INSERT INTO event_types (event_type_name, event_type_description, primary_color, secondary_color) VALUES ('Private Party', 'Invitation only, open invitation to those with invitation only.', '#7600FF', '#28173B');
INSERT INTO event_types (event_type_name, event_type_description, primary_color, secondary_color) VALUES ('Twerk Contest', 'Public party, party with prizes to the winner.', '#DA00FF', '#3D0047');
INSERT INTO event_types (event_type_name, event_type_description, primary_color, secondary_color) VALUES ('Best Booty', 'Public party, party with prizes to the winner.', '#FD89FA', '#FD00FA');

INSERT INTO event_status (event_status_name, event_status_description) VALUES ('Canceled', 'Event has been canceled.');
INSERT INTO event_status (event_status_name, event_status_description) VALUES ('In progress', 'Event is in progress.');
INSERT INTO event_status (event_status_name, event_status_description) VALUES ('Completed', 'Event has been completed.');
INSERT INTO event_status (event_status_name, event_status_description) VALUES ('Pending Rescheduling', 'Event is awaiting rescheduling.');

INSERT INTO event_frequency (event_frequency_name, event_frequency_description, event_frequency_multiplier) VALUES ('Monthly', 'Event occurs every month.', '12');
INSERT INTO event_frequency (event_frequency_name, event_frequency_description, event_frequency_multiplier) VALUES ('Weekly', 'Event occurs every week.', '52');
INSERT INTO event_frequency (event_frequency_name, event_frequency_description, event_frequency_multiplier) VALUES ('Annually', 'Event occurs every year.', '1');
INSERT INTO event_frequency (event_frequency_name, event_frequency_description, event_frequency_multiplier) VALUES ('Daily', 'Event occurs every day.', '365');
INSERT INTO event_frequency (event_frequency_name, event_frequency_description, event_frequency_multiplier) VALUES ('Once', 'One time event, no reoccurances.', '0');