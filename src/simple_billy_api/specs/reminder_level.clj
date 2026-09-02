(ns simple-billy-api.specs.reminder-level
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def reminder-level-data
  {
   })

(def reminder-level-spec
  (ds/spec
    {:name ::reminder-level
     :spec reminder-level-data}))
