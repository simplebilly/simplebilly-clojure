(ns simple-billy-api.specs.emit-event-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def emit-event-request-data
  {
   (ds/req :event_type) string?
   (ds/opt :payload) any-type-spec
   })

(def emit-event-request-spec
  (ds/spec
    {:name ::emit-event-request
     :spec emit-event-request-data}))
