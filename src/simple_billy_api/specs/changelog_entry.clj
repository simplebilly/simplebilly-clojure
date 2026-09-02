(ns simple-billy-api.specs.changelog-entry
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def changelog-entry-data
  {
   (ds/req :date) string?
   (ds/req :notes) string?
   (ds/req :version) string?
   })

(def changelog-entry-spec
  (ds/spec
    {:name ::changelog-entry
     :spec changelog-entry-data}))
