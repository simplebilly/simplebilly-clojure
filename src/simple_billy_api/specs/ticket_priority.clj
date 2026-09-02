(ns simple-billy-api.specs.ticket-priority
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ticket-priority-data
  {
   })

(def ticket-priority-spec
  (ds/spec
    {:name ::ticket-priority
     :spec ticket-priority-data}))
