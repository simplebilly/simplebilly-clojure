(ns simple-billy-api.specs.timeline-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def timeline-event-data
  {
   (ds/req :date) string?
   (ds/opt :detail) string?
   (ds/req :id) string?
   (ds/opt :status) string?
   (ds/req :title) string?
   (ds/req :type) string?
   })

(def timeline-event-spec
  (ds/spec
    {:name ::timeline-event
     :spec timeline-event-data}))
