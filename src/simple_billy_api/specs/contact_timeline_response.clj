(ns simple-billy-api.specs.contact-timeline-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.timeline-event :refer :all]
            )
  (:import (java.io File)))


(def contact-timeline-response-data
  {
   (ds/req :contactId) string?
   (ds/req :events) (s/coll-of timeline-event-spec)
   })

(def contact-timeline-response-spec
  (ds/spec
    {:name ::contact-timeline-response
     :spec contact-timeline-response-data}))
