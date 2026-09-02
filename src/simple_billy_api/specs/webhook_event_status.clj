(ns simple-billy-api.specs.webhook-event-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def webhook-event-status-data
  {
   })

(def webhook-event-status-spec
  (ds/spec
    {:name ::webhook-event-status
     :spec webhook-event-status-data}))
