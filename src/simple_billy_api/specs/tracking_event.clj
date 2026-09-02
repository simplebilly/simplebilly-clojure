(ns simple-billy-api.specs.tracking-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tracking-event-data
  {
   (ds/req :date) string?
   (ds/req :description) string?
   (ds/req :location) string?
   (ds/req :status) string?
   })

(def tracking-event-spec
  (ds/spec
    {:name ::tracking-event
     :spec tracking-event-data}))
