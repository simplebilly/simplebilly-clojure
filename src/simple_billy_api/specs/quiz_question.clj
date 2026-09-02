(ns simple-billy-api.specs.quiz-question
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def quiz-question-data
  {
   (ds/req :id) string?
   (ds/req :options) (s/coll-of string?)
   (ds/req :optionsEn) (s/coll-of string?)
   (ds/req :question) string?
   (ds/req :questionEn) string?
   })

(def quiz-question-spec
  (ds/spec
    {:name ::quiz-question
     :spec quiz-question-data}))
