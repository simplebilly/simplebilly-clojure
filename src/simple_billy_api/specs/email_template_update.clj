(ns simple-billy-api.specs.email-template-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.email-template-status :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def email-template-update-data
  {
   (ds/opt :body) string?
   (ds/opt :name) string?
   (ds/opt :status) email-template-status-spec
   (ds/opt :subject) string?
   (ds/opt :variables) any-type-spec
   })

(def email-template-update-spec
  (ds/spec
    {:name ::email-template-update
     :spec email-template-update-data}))
